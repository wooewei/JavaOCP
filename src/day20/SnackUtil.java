package day20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

import com.google.gson.Gson;

// 工具程式
public class SnackUtil {
	
	public static List<Snack> findAllSnacks() {
		Path path = Path.of("src/day20/snacks.json");
		List<Snack> snackList = null;
		try {
			//-- 撈取資料 -----------------------------------------
			String json = Files.readString(path);
			Gson gson = new Gson();
			Snack[] snacks = gson.fromJson(json, Snack[].class);
			// Snack[] 轉 List<Snack>
			snackList = new ArrayList<>(List.of(snacks));
			// 洗牌
			Collections.shuffle(snackList);
		} catch (IOException e) {
			System.err.printf("發生錯誤:%s%n", e.getMessage());
		}
		return snackList;
	}
	
	// 找距離最近的小吃
	// 原始資料: snackList
	// 你的位置: lat1, lon1 (經緯度)
	// 距離你的位置: m (公尺)
	public static List<Snack> findNearest(double lat1, double lon1, double m) {
		List<Snack> snackList = findAllSnacks();
		List<Snack> newSnackList = snackList.stream()
											.filter(snack -> {
												// 小吃店的經緯度
												double lat2 = snack.getLatitude();
												double lon2 = snack.getLongitude();
												// 與小吃店的距離
												double d = Haversine.distance(lat1, lon1, lat2, lon2);
												// 設定 distance (偷塞)
												snack.setDistance(d);
												return d <= m;
											})
											.sorted(Comparator.comparingDouble(Snack::getDistance))
											.toList();
		return newSnackList;
	}
	
	// 測試
	public static void main(String[] args) {
		// 巨匠逢甲分校經緯度:(緯度)24.1761, (經度)120.6402
		int m = Integer.parseInt(JOptionPane.showInputDialog("請輸入距離(m)?"));
		List<Snack> snackList = findNearest(24.1761, 120.6402, m);
		
		System.out.printf("距離:%dm, 找到筆數:%d%n", m, snackList.size());
		for(Snack snack : snackList) {
			System.out.printf("%s %s %,.2fm%n", snack.getName(), snack.getLocation(), snack.getDistance());
		}
		
		String msg = "無資料";
		if(snackList.size() > 0) { // 有找到符合的資料
			msg = "";
			for(Snack snack : snackList) {
				msg += "距離:" + String.format("%.2fm", snack.getDistance()) + "\n"
						+ snack.getName() + " $" + snack.getPrice() + "\n"
						+ snack.getDescription() + "\n"
						+ "地點:" + snack.getLocation() + "\n\n";
			}
		}
		JOptionPane.showMessageDialog(null, msg);
		
	}
	
}