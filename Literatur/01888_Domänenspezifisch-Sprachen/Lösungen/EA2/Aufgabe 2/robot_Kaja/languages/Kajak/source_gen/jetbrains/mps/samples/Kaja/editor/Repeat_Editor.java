package jetbrains.mps.samples.Kaja.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Repeat_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_b86mo8_a(editorContext, node);
  }
  private EditorCell createCollection_b86mo8_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_b86mo8_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createComponent_b86mo8_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_b86mo8_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_b86mo8_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_b86mo8_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_b86mo8_e0(editorContext, node));
    return editorCell;
  }
  private EditorCell createComponent_b86mo8_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.apply_KeyWord(style, editorCell);
    style.set(StyleAttributes.EDITABLE, 0, false);
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private EditorCell createProperty_b86mo8_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("count");
    provider.setNoTargetText("<no count>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_count");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.apply_NumericLiteral(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_b86mo8_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "times");
    editorCell.setCellId("Constant_b86mo8_c0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.apply_KeyWord(style, editorCell);
    style.set(StyleAttributes.PUNCTUATION_RIGHT, 0, Repeat_Editor._StyleParameter_QueryFunction_b86mo8_a0c0(editorContext, node));
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, Repeat_Editor._StyleParameter_QueryFunction_b86mo8_a1c0(editorContext, node));
    style.set(StyleAttributes.MATCHING_LABEL, 0, "block");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private static boolean _StyleParameter_QueryFunction_b86mo8_a0c0(EditorContext editorContext, SNode node) {
    return ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, 0x2de971c785ecd14fL, "body")), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, 0x2de971c785f06a40L, "commands"))).isEmpty();
  }
  private static boolean _StyleParameter_QueryFunction_b86mo8_a1c0(EditorContext editorContext, SNode node) {
    return ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(node, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, 0x2de971c785ecd14fL, "body")), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, 0x2de971c785f06a40L, "commands"))).isNotEmpty();
  }
  private EditorCell createRefNode_b86mo8_d0(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Repeat_Editor.bodySingleRoleHandler_b86mo8_d0(node, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, 0x2de971c785ecd14fL, "body"), editorContext);
    return provider.createCell();
  }
  private class bodySingleRoleHandler_b86mo8_d0 extends SingleRoleCellProvider {
    public bodySingleRoleHandler_b86mo8_d0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("body");
      }
      Style style = new StyleImpl();
      SNode node = myOwnerNode;
      EditorContext editorContext = myEditorContext;
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, 0, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_body");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no body>";
    }
  }
  private EditorCell createConstant_b86mo8_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "end");
    editorCell.setCellId("Constant_b86mo8_e0");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.apply_KeyWord(style, editorCell);
    style.set(StyleAttributes.MATCHING_LABEL, 0, "block");
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
