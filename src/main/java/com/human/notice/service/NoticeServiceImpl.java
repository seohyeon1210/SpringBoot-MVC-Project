package com.human.notice.service;

import com.human.notice.repository.NoticeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("noticeService")
@Transactional(propagation = Propagation.REQUIRED)
public class NoticeServiceImpl implements NoticeService {

    @Autowired
    private NoticeDAO noticeDAO;

    @Override
    public List listNotice() throws Exception {

        /* 공지글 관리 기능 */

        List noticeList = null;
        noticeList = noticeDAO.selectAllNoticeList();
        return noticeList;
    }
}
