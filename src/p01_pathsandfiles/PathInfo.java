package p01_pathsandfiles;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathInfo {
	
	public static void main(String[] args) {
		
		Path path = Paths.get("data/colors.txt");
		
		showPathInfo(path);
		
		//String content = new String(Files.readAllBytes(path));
		
	}

	private static void showPathInfo(Path path) {
		System.out.format("toString: %s%n", path.toString());
		System.out.format("getFileName: %s%n", path.getFileName());
		System.out.format("getName(0): %s%n", path.getName(0));
		System.out.format("getNameCount: %d%n", path.getNameCount());
		System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
		System.out.format("getParent: %s%n", path.getParent());
		System.out.format("getRoot: %s%n", path.getRoot());
		try {
			System.out.format("toRealPath: %s%n", path.toRealPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
