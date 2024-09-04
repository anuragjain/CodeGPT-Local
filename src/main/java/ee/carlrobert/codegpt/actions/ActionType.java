package ee.carlrobert.codegpt.actions;

public enum ActionType {

  CLEAR_CHAT_WINDOW,
  CREATE_NEW_CHAT,
  DELETE_ALL_CONVERSATIONS,
  DELETE_CONVERSATION,
  DISCARD_TOKEN_LIMIT,
  OPEN_CONVERSATION_IN_EDITOR,
  DIFF_CODE,
  EDIT_CODE,
  CREATE_NEW_FILE,
  COPY_CODE,
  REPLACE_IN_MAIN_EDITOR,
  INSERT_AT_CARET,
  RELOAD_MESSAGE,
  CHANGE_PROVIDER
}
