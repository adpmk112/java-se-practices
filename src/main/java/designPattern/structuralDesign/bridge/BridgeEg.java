package designPattern.structuralDesign.bridge;

public class BridgeEg {
	public static void main(String[] args) {
		DownloadApi downloadApi = new Mega();
		Type t = new File(downloadApi);
		t.download();
		
		downloadApi = new Gdrive();
		t = new Zip(downloadApi);
		t.download();
	}
}
