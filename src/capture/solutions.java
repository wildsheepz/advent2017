package capture;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class solutions {
	public static void main(String[] args) {
		// d1captcha("1122");
		// d1captcha("1111");
		// d1captcha("1234");
		// d1captcha("91212129");
		// d1captcha(
		// "34997744892914653296827871613388552993634935173733597474997393431324121718942484674492133736486619515246829248477836544451943938832848157199224116563715646126431493563772112714741546635764665586452858349326658345524573681224829221829772728531278893357146638772291782796744812479595172578555931968285326741191558735491923682586844185476584124677856856612582263263124715916498254659761312225295947328671873729594182695425852559718922816832816341259695766322357565252335851264933471555351536363944572763621761489944217787785564355131756948331413652646811626742168857634856234347432698931371757454156396432993421795675147273229642441888776517165375965288923515378871773449714189311167849788519479274172617334378412661574885156988171532483385528342851358599792154331889342985168528186562873736117113242271863318873917355428393173152783223727362282169982597123525671895452937118687191281382949335937173323862618172284254741935865963877359477126188879481911148827453781546789437317581568931445259912541273353345254171252588344612386649134562638758915336976347291218848744548755462493981871543949697331735577243658722111371552363179584543521149944247848176793571855164329415143753479297879926959141597695174674386467854776481689314612324534729187335368471697738925271618243312864656442299938886755679996568297498965651652337961837876468596749433454633975722561971935459554979713344313292511447288939379369279487299557326137798219646395436241742751581363752896833892713543627966633788455384129347637693559713174477262914916598991823983686226378396341554219544683439536933338185723832743964258335163993324191589246399535845434167819135413916443764931668386817282279877264296262823999224943974974489892778799656723453849139194948368998995531261224669478559359689167934624681622834931223728318247832134758581882736415334187562342375144693398771223127132562692525629392889723242374746911936313136382354858767169452656224519128287899264831463597663461857119132312578648894815417348364532372836621644176295776978942783714778954864719541832176633892147845693752248565147794357864859961462918847471158244516279178346514129117328285132341339595664283");
		// d1captcha2(
		// "34997744892914653296827871613388552993634935173733597474997393431324121718942484674492133736486619515246829248477836544451943938832848157199224116563715646126431493563772112714741546635764665586452858349326658345524573681224829221829772728531278893357146638772291782796744812479595172578555931968285326741191558735491923682586844185476584124677856856612582263263124715916498254659761312225295947328671873729594182695425852559718922816832816341259695766322357565252335851264933471555351536363944572763621761489944217787785564355131756948331413652646811626742168857634856234347432698931371757454156396432993421795675147273229642441888776517165375965288923515378871773449714189311167849788519479274172617334378412661574885156988171532483385528342851358599792154331889342985168528186562873736117113242271863318873917355428393173152783223727362282169982597123525671895452937118687191281382949335937173323862618172284254741935865963877359477126188879481911148827453781546789437317581568931445259912541273353345254171252588344612386649134562638758915336976347291218848744548755462493981871543949697331735577243658722111371552363179584543521149944247848176793571855164329415143753479297879926959141597695174674386467854776481689314612324534729187335368471697738925271618243312864656442299938886755679996568297498965651652337961837876468596749433454633975722561971935459554979713344313292511447288939379369279487299557326137798219646395436241742751581363752896833892713543627966633788455384129347637693559713174477262914916598991823983686226378396341554219544683439536933338185723832743964258335163993324191589246399535845434167819135413916443764931668386817282279877264296262823999224943974974489892778799656723453849139194948368998995531261224669478559359689167934624681622834931223728318247832134758581882736415334187562342375144693398771223127132562692525629392889723242374746911936313136382354858767169452656224519128287899264831463597663461857119132312578648894815417348364532372836621644176295776978942783714778954864719541832176633892147845693752248565147794357864859961462918847471158244516279178346514129117328285132341339595664283");
		// d2checksum("d2checksum_sample");
		// d2checksum("d2checksum_input");
		// d2checksum2("d2checksum_input");
		d3_calculateCarryDistance(1024);
		d3_calculateCarryDistance(289326);
		d3_calculateCarryDistance2(289326);
		//
		// d4_checkvalid("d4passphrases");
		//
		// d5("d5_input");
	}

	private static void d5(String s) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File(s)));
			String line = null;
			int pos = 0;
			LinkedList<Integer> l = new LinkedList<>();
			while ((line = br.readLine()) != null) {
				l.add(Integer.parseInt(line));
			}
			// int[] arr = new int[l.size()];
			// for (int i = 0; i < l.size(); ++i) {
			// arr[i] = l.get(i);
			// }
			int steps = 0;
			while (pos > -1 && pos < l.size()) {
				int op = l.get(pos);
				l.set(pos, op + 1);
				pos += op;
				++steps;
			}
			System.out.println(steps + " steps");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		}

	}

	private static void d4_checkvalid(String s) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File(s)));
			String line = null;
			int valid = 0;
			eachLine: while ((line = br.readLine()) != null) {
				HashMap<String, Void> map = new HashMap<>();
				String[] words = line.split("\\s");
				for (String word : words) {
					if (map.containsKey(word)) {
						continue eachLine;
					}
					map.put(word, null);
				}
				valid++;
			}
			System.out.println(valid + " valid passphrases");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}

	public static void d3_calculateCarryDistance(int number) {
		int width = (int) Math.ceil(Math.sqrt(number));
		System.out.println("width " + width);
		int last_num_in_prev_layer = (int) Math.pow(width - 1, 2);
		System.out.println("last_num_in_prev_layer " + last_num_in_prev_layer);
		int index_in_last_layer = number - last_num_in_prev_layer;
		System.out.println("index_in_last_layer " + index_in_last_layer);
		int index_in_last_side = index_in_last_layer % width;
		System.out.println("index_in_last_side " + index_in_last_side);
		int dist_to_halfwaymark = index_in_last_side - (int) Math.floor(width / 2);
		System.out.println("dist_to_halfwaymark " + dist_to_halfwaymark);
		System.out.println(Math.pow(width, 2));
		int distance = dist_to_halfwaymark + (int) Math.floor(width / 2);
		System.out.println("distance " + distance);
	}

	public static void d3_calculateCarryDistance2(int target_number) {
		List<List<Integer>> rows = new ArrayList<>();
		int width = 0;
		int number = 1;
		int row = 0;
		int col = 0;
		grow(rows, 1);
	}

	public static int getValueAt(int row, int col, List<List<Integer>> rows) {

	}

	public static void grow(List<List<Integer>> rows, int newWidth) {
		while (rows.size() < newWidth) {
			rows.add(0, new ArrayList<>());
			rows.add(rows.size(), new ArrayList<>());
		}
		Iterator<List<Integer>> iter = rows.iterator();
		while (iter.hasNext()) {
			List<Integer> cols = iter.next();
			while (cols.size() < newWidth) {
				cols.add(0, 0);
				cols.add(cols.size(), 0);
			}
		}
	}

	public static void getAdjacentSum() {

	}

	class graph {

	}

	public static void d2checksum2(String s) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File(s)));
			String line = null;
			int checksum = 0;
			while ((line = br.readLine()) != null) {
				String[] numbers = line.split("\\s");
				List<Integer> nums = new ArrayList<>();
				for (String number : numbers) {
					if (number.isEmpty()) {
						continue;
					}
					int n = Integer.parseInt(number.trim());
					nums.add(n);
				}
				Iterator<Integer> iter = nums.iterator();
				while (iter.hasNext()) {
					int testNum = iter.next();
					ArrayList<Integer> divisors = new ArrayList<>();
					divisors.addAll(nums);
					divisors.remove((Object) testNum);
					Iterator<Integer> divs = divisors.iterator();
					while (divs.hasNext()) {
						int div = divs.next();
						if (testNum % div == 0) {
							checksum += testNum / div;
						}
					}

				}

			}
			System.out.println(checksum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}

	public static void d2checksum(String s) {
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(new File(s)));
			String line = null;
			int checksum = 0;
			while ((line = br.readLine()) != null) {
				String[] numbers = line.split("\\s");
				int min = 999;
				int max = -999;
				for (String number : numbers) {
					if (number.isEmpty()) {
						continue;
					}
					int n = Integer.parseInt(number.trim());
					min = Math.min(n, min);
					max = Math.max(n, max);
				}
				int res = Math.abs(min - max);
				checksum += res;
			}
			System.out.println(checksum);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		}

	}

	public static void d1captcha2(String s) {
		int size = s.length();
		int sum = 0;
		for (int i = 0; i < size; ++i) {
			char c = s.charAt(i);
			char c2 = s.charAt((i + size / 2) % size);
			// System.out.println(Character.digit(s.charAt(i), 10));
			if (c == c2) {
				sum += Character.digit(s.charAt(i), 10);
			}
		}
		System.out.println(sum);
	}

	public static void d1captcha(String s) {
		int size = s.length();
		int sum = 0;
		for (int i = 0; i < size; ++i) {
			char c = s.charAt(i);
			char c2 = s.charAt((i + 1) % size);
			// System.out.println(Character.digit(s.charAt(i), 10));
			if (c == c2) {
				sum += Character.digit(s.charAt(i), 10);
			}
		}
		System.out.println(sum);
	}
}
