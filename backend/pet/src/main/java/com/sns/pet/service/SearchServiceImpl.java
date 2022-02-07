package com.sns.pet.service;

import com.sns.pet.dao.SearchDao;
import com.sns.pet.dto.SearchDto;
import com.sns.pet.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService {

    private final SqlSession sqlSession;

    @Override
    public List<String> findPastSearch(Long userNumber) throws Exception {
        return sqlSession.getMapper(SearchDao.class).selectPastKeyword(userNumber);
    }

    @Override
    public List<UserDto> findUserKeywordByUserID(String searchWord) throws Exception {
        return sqlSession.getMapper(SearchDao.class).selectUserKeywordByUserID(searchWord);
    }

    @Override
    public List<UserDto> findUserKeywordByName(String searchWord) throws Exception {
        return sqlSession.getMapper(SearchDao.class).selectUserKeywordByName(searchWord);
    }

//    @Override
//    public List<String> findSearchAboutTag(String searchWord) throws Exception {
//        return sqlSession.getMapper(SearchDao.class).selecthKeywordAboutTag(searchWord);
//    }
//
//    @Override
//    public List<SearchDto> findResultTag(String searchWord) throws Exception {
//        return sqlSession.getMapper(SearchDao.class).selectResultTag(searchWord);
//    }

    @Override
    public boolean addSearch(SearchDto searchDto) throws Exception {
        return sqlSession.getMapper(SearchDao.class).insertKeyword(searchDto) == 1;
    }
}
