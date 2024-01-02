package bohr.actions;

import bohr.customcodestyle.CustomCodeStyleInspection;
import com.intellij.codeInspection.InspectionManager;
import com.intellij.codeInspection.ProblemsHolder;
import com.intellij.debugger.mockJDI.members.MockPsiMethod;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

public class BohrAction extends AnAction {

    public void actionPerformed2(@NotNull AnActionEvent e) {
        Messages.showInfoMessage("Hello World", "Info");
    }


    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        MockPsiMethod method = getMethodToCheck();

        if (method != null && method.name().equals("badlyFormattedMethod")) {
            Messages.showInfoMessage("This method is poorly formatted!", "Info");
        }
    }

    private MockPsiMethod getMethodToCheck() {
        // Implemente este método para retornar o método que você deseja verificar
        // Pode ser o método atualmente aberto no editor, por exemplo
        return null;
    }
}
