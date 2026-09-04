package io.github.swangeese.prettyjson

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.ui.Messages

/**
 *  @auther swan-geese
 *  @verison
 *  @date
 *
 *  @Description
 *
 */
class IndentedJsonAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.getData(CommonDataKeys.EDITOR) ?: return
        val selectionModel = editor.selectionModel
        val selectedText = selectionModel.selectedText ?: return

        try {
            val indentedJson = JsonFormatter.compact(selectedText)
            WriteCommandAction.runWriteCommandAction(editor.project) {
                editor.document.replaceString(selectionModel.selectionStart, selectionModel.selectionEnd, indentedJson)
            }
        } catch (ex: Exception) {
            println(ex.message)
            Messages.showErrorDialog("Invalid JSON data", "Error")
        }
    }
}
