/**
 * Plagiarism Checker
 * A tool for finding the longest shared substring between two documents.
 *
 * @author Zach Blick
 * @author Damian Villarreal-Ayala
 */
public class PlagiarismChecker {

    /**
     * This method finds the longest sequence of characters that appear in both texts in the same order,
     * although not necessarily contiguously.
     * This means that the run of similar letters can skip some letters, and it doesn't have to go letter by letter.
     * @param doc1 the first document
     * @param doc2 the second
     * @return The length of the longest shared substring.
     *
     * Idea Bank:
     * - Creating/filling a 2D array that holds the longestShareSubstring up until the char.
     *  - If we use the table, we can only increase longestSubstringLength by going down and to the right
     *  while traversing table, otherwise we'd be moving backwards through one of the strings.
     *  - Doesn't matter of there's a gap between columns when adding to LongestSubstringLength so long as next match is below.
     */
    public static int longestSharedSubstring(String doc1, String doc2) {

        // TODO Complete this function to return the length of the longest shared substring.
        //Adding one to the length to include a "buffer"/empty space that can serve as "base cases".
        int[][] inspectionTable = new int[doc1.length() + 1][doc2.length() + 1];
        int  fill = 0;
        //Goes through and fills first row and column with 0.
        while(fill < doc1.length())
        {
            inspectionTable[fill][0] = 0;
            fill++;
        }
        fill = 0;
        while(fill < doc2.length())
        {
            inspectionTable[0][fill] = 0;
            fill++;
        }


        return 0;
    }

}
