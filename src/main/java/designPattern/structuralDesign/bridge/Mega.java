package designPattern.structuralDesign.bridge;

public class Mega implements DownloadApi {

	@Override
	public void downloadFile() {
		// TODO Auto-generated method stub
		System.out.println("Download a file from Mega");
	}

	@Override
	public void downloadZip() {
		// TODO Auto-generated method stub
		System.out.println("Download Zipfile from Mega");
	}

}
