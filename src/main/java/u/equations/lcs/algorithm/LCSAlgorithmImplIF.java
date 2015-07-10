package u.equations.lcs.algorithm;

import java.util.List;

/**
 * Created by parallels on 7/8/15.
 *
 * @author U-Equations
 * @version $Id: $Id
 */
public interface LCSAlgorithmImplIF {

    /**
     * <p>findLCS.</p>
     *
     * @param setOfStrings a {@link java.util.List} object.
     * @return a {@link java.lang.String} object.
     */
    String findLCS(List<String> setOfStrings);

}
