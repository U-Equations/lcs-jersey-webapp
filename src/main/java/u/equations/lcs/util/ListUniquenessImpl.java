package u.equations.lcs.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import u.equations.lcs.resource.LCS_Resource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by parallels on 7/8/15.
 *
 * @author U-Equations
 * @version $Id: $Id
 */
public class ListUniquenessImpl implements UniquenessIF {

    private static final Logger logger = LoggerFactory
            .getLogger(LCS_Resource.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean isUnique(List<String> stringList) {

        Boolean unique;
        Integer sizeOfList = stringList.size();
        Set<String> stringSet = new HashSet<>();
        stringSet.addAll(stringList);
        Integer sizeOfSet = stringSet.size();

        unique = sizeOfList.intValue() == sizeOfSet.intValue();

        logger.info("unique: " + unique);

        return unique;
    }
}
