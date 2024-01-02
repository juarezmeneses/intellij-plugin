package bohr.actions;

import com.intellij.build.output.BuildOutputInstantReader;
import com.intellij.build.output.BuildOutputParser;
import com.intellij.build.output.JavacOutputParser;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.editor.markup.RangeHighlighter;
import com.intellij.openapi.project.Project;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class PomDependencyVersionExtractor extends AnAction {
    @Override
    public void actionPerformed( AnActionEvent e) {
        // Obtém o projeto atual
        Project project = e.getProject();
        System.out.println("Project: " + project.toString());

    }


}
