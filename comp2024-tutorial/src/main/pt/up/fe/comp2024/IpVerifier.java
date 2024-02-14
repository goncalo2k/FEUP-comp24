package pt.up.fe.comp2024;

import pt.up.fe.comp.jmm.ast.AJmmVisitor;
import pt.up.fe.comp.jmm.ast.JmmNode;

public class IpVerifier extends AJmmVisitor<String, Boolean> {
    protected void buildVisitor() {
        addVisit("program", this::visitDefault);
    }

    protected Boolean visitDefault(JmmNode node, String str) {
        for (var c : node.getChildren()) {
            visit(c);
        }
        return true;
    }
}