class Nilai_Max {
	public static void main (String[] args){
		int nilai1 = 90;
		int nilai2 = 33;
		int nilai3 = 23;
		int nilai_max = 0;

		nilai_max = nilai1 >= nilai_max ? nilai1 : nilai_max;
		nilai_max = nilai2 >= nilai_max ? nilai2 : nilai_max;
		nilai_max = nilai3 >= nilai_max ? nilai3 : nilai_max;

		System.out.print("Nilai Maximal : " + nilai_max);
	}
}

