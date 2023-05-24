public class SequentialSearchSTTest{
	public static void main(String[] args) {
		SequentialSearchST<String, Integer> object = new SequentialSearchST<String, Integer>();
		object.put("L",12);
		object.put("T",11);
		object.put("P",10);
		object.put("M",9);
		object.put("X",7);
		object.delete("M");
		object.delete("T");

		assert(object.size() == 4);

		System.out.println(object.keys());
        System.out.println(object.isEmpty());
        System.out.println(object.size());

        System.out.println("All Test Cases Passed");

	}
}