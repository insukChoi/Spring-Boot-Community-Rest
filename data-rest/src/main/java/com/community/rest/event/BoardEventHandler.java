package com.community.rest.event;

import com.community.rest.domain.Board;

import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

@RepositoryEventHandler(Board.class)
public class BoardEventHandler {

    @HandleBeforeCreate
    public void beforeCreateBoard(Board board) {
        System.out.println("CIS >> before create");
        board.setCreatedDateNow();
    }

    @HandleBeforeSave
    public void beforeSaveBoard(Board board) {
        System.out.println("CIS >> before save");
        board.setUpdatedDateNow();
    }
}
