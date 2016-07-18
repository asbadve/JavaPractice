import java.util.ArrayList;
import java.util.Comparator;

public class CricketPlayer {
	String name;
	int noOfInnings;
	int noOfTimesNotOut;
	int totalRuns;
	double battingAverage;

	/***
	 * 
	 * @param name
	 * @param noOfInnings
	 * @param noOfTimesNotOut
	 * @param totalRuns
	 * @param battingAverage
	 */
	public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns, double battingAverage) {
		super();
		this.name = name;
		this.noOfInnings = noOfInnings;
		this.noOfTimesNotOut = noOfTimesNotOut;
		this.totalRuns = totalRuns;
		this.battingAverage = battingAverage;
	}

	@Override
	public String toString() {
		return "CricketPlayer [name=" + name + ", noOfInnings=" + noOfInnings + ", noOfTimesNotOut=" + noOfTimesNotOut
				+ ", totalRuns=" + totalRuns + ", battingAverage=" + battingAverage + "]";
	}

	/***
	 * Calculate the batting average for the player
	 * 
	 * @param totalRuns
	 * @param noOfInnings
	 * @param noOfTimesNotOut
	 * @return batting average
	 */
	static double avg(int totalRuns, int noOfInnings, int noOfTimesNotOut) {
		return (totalRuns / (noOfInnings - noOfTimesNotOut));
	}

	/***
	 * Sort the array by batting average
	 * 
	 * @param unsortedArray
	 * @return sorted array
	 */
	static CricketPlayer[] sortCricketPlayer(CricketPlayer[] unsortedArray) {
		ArrayList<CricketPlayer> arrayList = Arrays.asList(unsortedArray);
		arrayList.sort(new Comparator<CricketPlayer>() {
			@Override
			public int compare(CricketPlayer o1, CricketPlayer o2) {
				// TODO Auto-generated method stub
				return o1.battingAverage > o2.battingAverage ? -1 : (o1.battingAverage == o2.battingAverage ? 0 : 1);
			}
		});
		return ArrayLists.asArray(arrayList);
	}

	static class Arrays {
		/***
		 * Convert {@link CricketPlayer}array to the arrayList
		 * 
		 * @param array
		 * @return arrayList
		 */
		static ArrayList<CricketPlayer> asList(CricketPlayer[] array) {
			int length = array.length;
			ArrayList<CricketPlayer> arrayList = new ArrayList<>(length);
			for (int i = 0; i < length; i++) {
				String name = array[i].name;
				int noOfInnings = array[i].noOfInnings;
				int noOfTimesNotOut = array[i].noOfTimesNotOut;
				int totalRuns = array[i].totalRuns;
				double battingAverage = array[i].battingAverage;
				arrayList.add(new CricketPlayer(name, noOfInnings, noOfTimesNotOut, totalRuns, battingAverage));
			}
			return arrayList;
		}
	}

	static class ArrayLists {
		/***
		 * convert array list to the array
		 * 
		 * @param arrayList
		 * @return array
		 */
		static CricketPlayer[] asArray(ArrayList<CricketPlayer> arrayList) {
			int size = arrayList.size();
			CricketPlayer[] cricketPlayerArray = new CricketPlayer[size];
			for (int i = 0; i < size; i++) {
				CricketPlayer cricketPlayer = arrayList.get(i);
				cricketPlayerArray[i] = cricketPlayer;
			}
			return cricketPlayerArray;
		}
	}

}
