import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<>();
        for(int i = 0; i < arraySize; i++){
            int value = scanner.nextInt();
            array.add(value);
        }
        int operation = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < operation; i++){
            String input = scanner.nextLine();
            if(input == "Delete"){
                int index = scanner.nextInt();
                array.remove(index);
            }
            if(input.equals("Insert")){
                int index = scanner.nextInt();
                int newValue = scanner.nextInt();
                array.add(index, newValue);
            }
      
        }
        for(int x : array)
            System.out.print(x + " ");    

	}
}
