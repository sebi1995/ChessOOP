package pl.sda.patterns.command;

public interface FileSystemReceiver {

	void openFile();
	void writeFile();
	void closeFile();
}
