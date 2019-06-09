
public class apples {
	public static void main(String args[]){
		tuna tunaObject = new tuna();
		tuna tunaObject2 = new tuna(5);
		tuna tunaObject3 = new tuna(5, 13);
		tuna tunaObject4 = new tuna(5, 13, 43);

		System.out.println(tunaObject.toMilitary());
		System.out.println(tunaObject2.toMilitary());
		System.out.println(tunaObject3.toMilitary());
		System.out.println(tunaObject4.toMilitary());
		
    }
}
