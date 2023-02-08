package hello.blowaway.blow;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlowService {

    private final BlowMapper blowMapper;

    public BlowService(BlowMapper blowMapper) {
        this.blowMapper = blowMapper;
    }

    public List<BlowDto> blowList() {
        return blowMapper.blowList();
    }

    public BlowDto selectBlow(Integer wid) {
        return blowMapper.selectBlow(wid);
    }

    public Integer createBlow(BlowDto blowDto) {
        return blowMapper.createBlow(blowDto);
    }

    public Integer updateBlow(BlowDto blowDto) {
        return blowMapper.updateBlow(blowDto);
    }

    public Integer updateHit (Integer wid) {
        return blowMapper.updateHit(wid);
    }

    public Integer deleteBlow (Integer wid) {
        return blowMapper.deleteBlow(wid);
    }
}
