package u.equations.lcs.util;

import u.equations.lcs.resource.LCS_Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by parallels on 7/8/15.
 */
public class ListUniquenessImpl implements UniquenessIF {

    private static final Logger logger = LoggerFactory
            .getLogger(LCS_Resource.class);

    @Override
    public Boolean isUnique(List<String> stringList) {

        Boolean unique = false;
        Integer sizeOfList = stringList.size();
        Set<String> stringSet = new HashSet<String>();
        stringSet.addAll(stringList);
        Integer sizeOfSet = stringSet.size();

        if(sizeOfList.intValue() == sizeOfSet.intValue()){
            unique = true;
        } else { unique = false;}

        logger.info("unique: " + unique);

        return unique;
    }
}
