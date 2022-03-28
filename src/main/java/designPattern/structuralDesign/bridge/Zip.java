package designPattern.structuralDesign.bridge;

public class Zip extends Type {

	Zip(DownloadApi api) {
		super(api);
		// TODO Auto-generated constructor stub
	}

	@Override
	void download() {
		// TODO Auto-generated method stub
		api.downloadZip();
	}

}
