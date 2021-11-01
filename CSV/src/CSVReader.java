import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\hope9\\Desktop\\Coding\\Java\\CSV\\src\\SacramentocrimeJanuary2006.csv";
		path = path.replace("\\", "/");
		
		String line ="";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null){
				String[] values = line.split(",");
				System.out.println("Dates: "  + values[0] + ", " +  "Crime description: " + values[5]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
