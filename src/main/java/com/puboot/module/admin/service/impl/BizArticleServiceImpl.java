package com.puboot.module.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.puboot.common.util.CoreConst;
import com.puboot.common.util.Pagination;
import com.puboot.module.admin.mapper.BizArticleMapper;
import com.puboot.module.admin.model.BizArticle;
import com.puboot.module.admin.service.BizArticleService;
import com.puboot.module.admin.vo.ArticleConditionVo;
import lombok.AllArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author Linzhaoguan
 * @version V1.0
 * @date 2019年9月11日
 */
@Service
@AllArgsConstructor
public class BizArticleServiceImpl extends ServiceImpl<BizArticleMapper, BizArticle> implements BizArticleService {

    private final BizArticleMapper bizArticleMapper;

    @Override
    public List<BizArticle> findByCondition(IPage<BizArticle> page, ArticleConditionVo vo) {
        //获取数据
        List<BizArticle> list = bizArticleMapper.findByCondition(page, vo);
        //check空
        if (CollectionUtils.isNotEmpty(list)) {
            //创建新的数组
            List<Integer> ids = new ArrayList<>();
            for (BizArticle bizArticle : list) {
                //循环之后把新的数组放到集合中
                ids.add(bizArticle.getId());
            }
            //根据IDS 查询
            List<BizArticle> listTag = bizArticleMapper.listTagsByArticleId(ids);
            // listTag, 重新组装数据为{id: Article}   去重操作
            Map<Integer, BizArticle> tagMap = new LinkedHashMap<>(listTag.size());
            for (BizArticle bizArticle : listTag) {
                tagMap.put(bizArticle.getId(), bizArticle);
            }

            //获取对象
            for (BizArticle bizArticle : list) {
                //通过ID获取map集合的对象
                BizArticle tagArticle = tagMap.get(bizArticle.getId());
                //对象进行非null check
                if (Objects.nonNull(tagArticle)) {
                    //如果不是null  设置标签
                    bizArticle.setTags(tagArticle.getTags());
                }
            }
        }
        return list;
    }

    @Override
    public List<BizArticle> sliderList() {
        ArticleConditionVo vo = new ArticleConditionVo();
        vo.setSlider(true);
        vo.setStatus(CoreConst.STATUS_VALID);
        return this.findByCondition(null, vo);
    }

    @Override
    public List<BizArticle> recommendedList(int pageSize) {
        ArticleConditionVo vo = new ArticleConditionVo();
        vo.setRecommended(true);
        vo.setStatus(CoreConst.STATUS_VALID);
        vo.setPageSize(pageSize);
        IPage<BizArticle> page = new Pagination<>(vo.getPageNumber(), vo.getPageSize());
        return this.findByCondition(page, vo);
    }

    @Override
    public List<BizArticle> recentList(int pageSize) {
        ArticleConditionVo vo = new ArticleConditionVo();
        vo.setPageSize(pageSize);
        vo.setStatus(CoreConst.STATUS_VALID);
        vo.setRecentFlag(true);
        IPage<BizArticle> page = new Pagination<>(vo.getPageNumber(), vo.getPageSize());
        return this.findByCondition(page, vo);
    }

    @Override
    public List<BizArticle> randomList(int pageSize) {
        ArticleConditionVo vo = new ArticleConditionVo();
        vo.setRandom(true);
        vo.setStatus(CoreConst.STATUS_VALID);
        vo.setPageSize(pageSize);
        IPage<BizArticle> page = new Pagination<>(vo.getPageNumber(), vo.getPageSize());
        return this.findByCondition(page, vo);
    }

    @Override
    public List<BizArticle> hotList(int pageSize) {
        IPage<BizArticle> page = new Pagination<>(1, pageSize);
        return bizArticleMapper.hotList(page);
    }

    @Override
    public BizArticle selectById(Integer id) {
        return bizArticleMapper.getById(id);
    }

    @Override
    public BizArticle insertArticle(BizArticle bizArticle) {
        Date date = new Date();
        bizArticle.setCreateTime(date);
        bizArticle.setUpdateTime(date);
        bizArticleMapper.insert(bizArticle);
        return bizArticle;
    }

    @Override
    public int deleteBatch(Integer[] ids) {
        return bizArticleMapper.deleteBatch(ids);
    }

    @Override
    public List<BizArticle> selectByCategoryId(Integer categoryId) {
        return bizArticleMapper.selectList(Wrappers.<BizArticle>lambdaQuery().eq(BizArticle::getCategoryId, categoryId));
    }

}
