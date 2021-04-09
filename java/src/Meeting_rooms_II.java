import java.util.Arrays;

public class Meeting_rooms_II {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length < 1) return 0;
        if(intervals.length < 2) return 1;
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j = 0, ans = 0, curr = 0;
        while(i < intervals.length){
            if(start[i] < end[j]){
                i++;
                curr++;
                ans = Math.max(ans, curr);
            }
            else{
                j++;
                curr--;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        Meeting_rooms_II s = new Meeting_rooms_II();
        System.out.println(s.minMeetingRooms(intervals));
    }
}
