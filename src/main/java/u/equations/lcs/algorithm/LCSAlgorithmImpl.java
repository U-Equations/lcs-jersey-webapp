package u.equations.lcs.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import u.equations.lcs.util.SuffixArray;

import java.util.List;

/**
 * Created by parallels on 7/8/15.
 *
 * @author U-Equations
 * @version $Id: $Id
 */
public class LCSAlgorithmImpl implements LCSAlgorithmImplIF {

    private static final Logger logger = LoggerFactory
            .getLogger(LCSAlgorithmImpl.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public String findLCS(List<String> listOfStrings) {

        String compareString = listOfStrings.iterator().next();
        String LCS;
String LCSTemp = "";

        for (String setString : listOfStrings) {

            LCSTemp = findLCSFromPair(compareString, setString);
            logger.info("LCSTemp: " + LCSTemp);
            compareString = LCSTemp;
        }
        logger.info(LCSTemp);
        LCS = LCSTemp;
        return LCS;
    }

    private String findLCSFromPair(String text1, String text2) {

        int N1 = text1.length();
        // int N2 = text2.length();

        // concatenate two string with intervening '\1'
        String text = text1 + '\1' + text2;
        int N = text.length();

        // compute suffix array of concatenated text
        SuffixArray suffix = new SuffixArray(text);

        // search for longest common substring
        String lcs = "";
        for (int i = 1; i < N; i++) {

            // adjacent suffixes both from first text string
            if (suffix.index(i) < N1 && suffix.index(i - 1) < N1) continue;

            // adjacent suffixes both from secondt text string
            if (suffix.index(i) > N1 && suffix.index(i - 1) > N1) continue;

            // check if adjacent suffixes longer common substring
            int length = suffix.lcp(i);
            if (length > lcs.length()) {
                lcs = text.substring(suffix.index(i), suffix.index(i) + length);
            }
        }

        // print out longest common substring
        System.out.println(lcs.length());
        System.out.println("'" + lcs + "'");
        return lcs;
    }

}
