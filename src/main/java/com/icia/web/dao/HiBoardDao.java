package com.icia.web.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.icia.web.model.HiBoard;
import com.icia.web.model.HiBoardFile;

@Repository("hiBoardDao")
public interface HiBoardDao 
{
   //게시물 총개수
   public long boardListCount(HiBoard hiBoard);
   public long boardListCount2(HiBoard hiBoard);
   
   //게시물 조회
   public List<HiBoard> boardList(HiBoard hiBoard);
   
   //게시물 등록
   public int boardInsert(HiBoard hiBoard);
   
   //게시물 답글 등록
   public int boardReplyInsert(HiBoard hiBoard);
   
   //게시물 조회
   public HiBoard boardSelect(long hiBbsSeq);
   
   //게시물 수정
   public int boardUpdate(HiBoard hiBoard);
   
   //게시물 그룹 순서 변경
   public int boardGroupOrderUpdate(HiBoard hiBoard);
   
   //게시물 조회수 증가
   public int boardReadCntPlus(long hiBbsSeq);
   
   //게시물 삭제
   public int boardDelete(long hiBbsSeq);
   
   // ############################################################
   //게시물 첨부파일 등록
   public int boardFileInsert(HiBoardFile hiBoardFile);
   
   //게시물 첨부파일 조회
   public HiBoardFile boardFileSelect(long hiBbsSeq);
   
   //게시물 첨부파일 삭제
   public int boardFileDelete(long hiBbsSeq);
   
   // ############################################################
   //게시물 삭제시, 답변 글 수 체크
   public int boardAnswersCount(long hiBbsSeq);
   
   //게시물 답글 조회
   public List<HiBoard> boardReplyList(HiBoard hiBoard);
   
   //게시물 답글 삭제
   public int boardReplyDelete(HiBoard hiBoard);
}