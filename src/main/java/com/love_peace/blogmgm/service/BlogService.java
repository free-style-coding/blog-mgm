package com.love_peace.blogmgm.service;

import com.love_peace.blogmgm.entity.Blog;
import com.love_peace.blogmgm.param.dto.WriteBlogDTO;
import com.love_peace.blogmgm.param.enums.BlogType;
import com.love_peace.blogmgm.param.vo.ResultVo;
import com.love_peace.blogmgm.repository.BlogRepository;
import com.love_peace.blogmgm.util.TransIdUtil;
import org.apache.commons.lang3.EnumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author: LiuHao
 * @Descirption:
 * @Date: 2018/9/30_15:35
 */
@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Transactional
    public ResultVo writeBlog(WriteBlogDTO writeBlogDTO){
        Blog blog = new Blog();
        blog.setBlogId(TransIdUtil.generateNumForTrans("WRITE_BLOG_"));
        blog.setTitle(writeBlogDTO.getTitle());
        blog.setText(writeBlogDTO.getText());
        BlogType blogType = EnumUtils.getEnum(BlogType.class,writeBlogDTO.getType());
        if(blogType == null){
            throw new RuntimeException("博客类型未找到");
        }
        blog.setType(blogType);
        blogRepository.persist(blog);
        return ResultVo.put(0,"博文写入成功");
    }
}
