package designPattern.structuralDesign.bridge;

public class Gdrive implements DownloadApi {

	@Override
	public void downloadFile() {
		// TODO Auto-generated method stub
		System.out.println("Download a file from Gdrive");
	}

	@Override
	public void downloadZip() {
		// TODO Auto-generated method stub
		System.out.println("Download ZipFile from Gdrive");
	}

}
