package designPattern.structuralDesign.bridge;

public class File extends Type {

	File(DownloadApi api) {
		super(api);
		// TODO Auto-generated constructor stub
	}

	@Override
	void download() {
		// TODO Auto-generated method stub
		api.downloadFile();
	}

}
