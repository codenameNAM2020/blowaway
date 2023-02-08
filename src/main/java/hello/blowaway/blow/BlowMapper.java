package hello.blowaway.blow;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlowMapper {

    List<BlowDto> blowList();
    BlowDto selectBlow(Integer wid);
    Integer createBlow(BlowDto blowDto);
    Integer updateBlow(BlowDto blowDto);
    Integer deleteBlow(Integer wid);

    Integer updateHit(Integer wid);
    Integer updateLikes(Integer wid);
}
