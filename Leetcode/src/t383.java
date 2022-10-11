/**
 * 作者： chris
 * 时间:  2022-10-08
 */
public class t383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] magazineNum = new int[26];
        int[] ransomNoteNum = new int[26];

        char c;
        for(int i = 0; i < ransomNote.length(); i++) {
            c = ransomNote.charAt(i);
            ransomNoteNum[c - 'a']++;
        }
        for(int i = 0; i < magazine.length(); i++) {
            c = magazine.charAt(i);
            magazineNum[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if(ransomNoteNum[i] > magazineNum[i]){
                return false;
            }
        }
        return true;
    }
}
