package test.guava;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkElementIndex;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;


public class PreconditionExample {
	private String label;
	private int[] values = new int[5];
	private int currentIndex;

	public PreconditionExample(String label) {
		// returns value of object if not null
		this.label = checkNotNull(label, "Label can''t be null");
	}

	public void updateCurrentIndexValue(int index, int valueToSet) {
		//Check index valid first
		this.currentIndex = checkElementIndex(index, values.length, "Index out of bounds for values");
		//Validate valueToSet
		checkArgument(valueToSet <= 100,"Value can't be more than 100");
		values[this.currentIndex] = valueToSet;
	}

	public void doOperation() {
		checkState(validateObjectState(), "Can't perform operation");
	}

	private boolean validateObjectState() {
		return this.label.equalsIgnoreCase("open") && values[this.currentIndex] == 10;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
		.omitNullValues()
		.add("label", label)
		.add("currentIndex", currentIndex)
		.add("values", values).toString();
	}
	

	
	public static void main(String[] args) {
		System.out.println(new PreconditionExample("test").toString());
	}
}