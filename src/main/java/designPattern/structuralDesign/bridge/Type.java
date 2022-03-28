package designPattern.structuralDesign.bridge;

abstract class Type {

	DownloadApi api;
		
	Type(DownloadApi api) {
		this.api = api;
}
	abstract void download();
}
