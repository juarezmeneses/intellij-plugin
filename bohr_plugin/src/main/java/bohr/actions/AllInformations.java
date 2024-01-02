package bohr.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Caret;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.pom.Navigatable;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AllInformations extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent event) {
        // Mostrar o nome do arquivo
        //String fileName = event.getData(CommonDataKeys.PSI_FILE).getName();
        //System.out.println("Arquivo: " + fileName);

        // Obtém o psiFile
        //PsiFile psiFile = event.getData(CommonDataKeys.PSI_FILE);
        //if (psiFile != null) {
        //    System.out.println("Psi File: " + psiFile.toString());
        //}

        // Mostrar o nome do método
        @Nullable Project method = event.getData(CommonDataKeys.PROJECT);
        if (method != null) {
            System.out.println("Project name: " + method.getName());
        }

        // Obtém o psiFile
        @Nullable Caret caret = event.getData(CommonDataKeys.CARET);
        if (caret != null) {
            System.out.println("Caret: " + caret.toString());
        }

        // Obtém o psiFile
        @Nullable VirtualFile virtualFile = event.getData(CommonDataKeys.VIRTUAL_FILE);
        if (virtualFile != null) {
            System.out.println("VirtualFile: " + virtualFile.toString());
        }

        // Obtém o projeto atual
        Project project = event.getProject();
        System.out.println("Project: " + project.toString());

        StringBuilder message =
                new StringBuilder(event.getPresentation().getText() + " Selected!");
        // If an element is selected in the editor, add info about it.
        Navigatable selectedElement = event.getData(CommonDataKeys.NAVIGATABLE);
        if (selectedElement != null) {
            message.append("\nSelected Element: ").append(selectedElement);
        }
        String title = event.getPresentation().getText();
        System.out.println("event: "+ event.toString());
        System.out.println("present: "+ event.getPresentation().toString());
        //System.out.println("descr: "+ event.getPresentation().getDescription().toString());
        System.out.println("title: "+ title);
        Messages.showMessageDialog(
                project,
                message.toString(),
                title,
                Messages.getInformationIcon());
    }

    @Override
    public void update(@NotNull AnActionEvent event) {
        // Set the availability based on whether a project is open
        Project currentProject = event.getProject();
        event.getPresentation().setEnabledAndVisible(currentProject != null);
    }
}
