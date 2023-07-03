package homework;

public class Work0630 {

	public void backupFile(String file) {
		StringBuilder sb = new StringBuilder();
			sb.append(file);
			
		String fileName;
		String extensionName;
		
		int dot = file.lastIndexOf(".");
		if (dot != -1 ) {
			fileName = sb.substring(0, dot);
			extensionName = sb.substring(dot);
			System.out.println(fileName + "_bak" + extensionName);
		}else {
			System.out.println(file + "_bak");
		}
	}
	
	
	public void makePassWord() {
		int character;
		double d;
		int tempPassWord = 0;
		
		for (int i = 0; i < 8; i++) {
			d = Math.random();
			character = (int)(d * 3);
			if (character == 0) {
				tempPassWord = (int)(d*26)+65;
			}else if (character == 1) {
				tempPassWord = (int)(d*26)+97;
			}else if (character == 2) {
				tempPassWord = (int)(d*10)+48;
			}
			System.out.print((char)tempPassWord);
		}
		
	}
	public static void main(String[] args) {
		Work0630 passWord = new Work0630();
		Work0630 backupFileName = new Work0630();
		passWord.makePassWord();
		System.out.println();
		System.out.println("====================================");
		backupFileName.backupFile("tesfduihfidsb.hwp");
		
		
	}

}
