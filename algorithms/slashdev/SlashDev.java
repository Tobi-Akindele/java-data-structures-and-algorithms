package slashdev;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class SlashDev {

	public static void main(String[] args) {
		// System.out.println("hello world");
		try {
			File f = new File("newfile.txt");
			f.createNewFile();
			if (f.exists()) {
				String fp = f.getAbsoluteFile().getParent();
				File dir = new File(fp);
				String[] dlist = dir.list();
				Arrays.sort(dlist);
				String challengeToken = "kf9m1ouxc2";

				for (int k = 0; k < dlist.length; k++) {
					for (int i = 0; i < challengeToken.length(); i++) {
						String uc = Character.toString(Character.toUpperCase(challengeToken.charAt(i)));
						String lc = Character.toString(Character.toLowerCase(challengeToken.charAt(i)));
						if (dlist[k].contains(uc) || dlist[k].contains(lc)) {
							dlist[k] = dlist[k].replaceAll(uc, "--" + uc + "--");
							dlist[k] = dlist[k].replaceAll(lc, "--" + lc + "--");

						}
					}
					String comma = k != dlist.length - 1 ? ", " : "";

					System.out.print(dlist[k] + comma);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}