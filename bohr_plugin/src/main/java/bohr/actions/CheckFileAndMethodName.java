package bohr.actions;

import com.intellij.debugger.mockJDI.members.MockPsiMethod;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

public class CheckFileAndMethodName extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent event) {
        // Mostrar o nome do arquivo
        String fileName = event.getData(CommonDataKeys.PSI_FILE).getName();
        System.out.println("File name: " + fileName);

        // Mostrar o nome do método
        @Nullable Project method = event.getData(CommonDataKeys.PROJECT);
        if (method != null) {
            System.out.println("Project name: " + method.getName());
        }



    }
}
