import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("/Users/joshua/Pictures");
		File[] files = directory.listFiles();

		// classic
		Arrays.sort(files, new Comparator<File>(){
		    public int compare(File f1, File f2)
		    {
		    	int n = 1;
		    	return String.valueOf(f1.getName()).compareTo(f2.getName());
		        //return Long.valueOf(f1.lastModified()).compareTo(f2.lastModified());
		    } });
		
		List<File> fileList = Arrays.asList(files);
		fileList.stream().forEach(file -> {
			System.out.println(file.getName());
		});
		
	}

}
