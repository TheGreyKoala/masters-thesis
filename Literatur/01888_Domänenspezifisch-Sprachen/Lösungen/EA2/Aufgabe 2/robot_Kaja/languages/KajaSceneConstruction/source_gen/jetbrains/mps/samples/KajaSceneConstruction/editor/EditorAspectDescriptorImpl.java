package jetbrains.mps.samples.KajaSceneConstruction.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a8341e10L, "jetbrains.mps.samples.KajaSceneConstruction.structure.BuildWall"))) {
        return Collections.<ConceptEditor>singletonList(new BuildWall_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fa55L, "jetbrains.mps.samples.KajaSceneConstruction.structure.DestroyWall"))) {
        return Collections.<ConceptEditor>singletonList(new DestroyWall_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3eL, "jetbrains.mps.samples.KajaSceneConstruction.structure.DropMark"))) {
        return Collections.<ConceptEditor>singletonList(new DropMark_Editor());
      }
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a835165fL, "jetbrains.mps.samples.KajaSceneConstruction.structure.PickMark"))) {
        return Collections.<ConceptEditor>singletonList(new PickMark_Editor());
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }

  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      if (SConceptOperations.isExactly(SNodeOperations.asSConcept(cncpt), MetaAdapterFactory.getConcept(0xb56912a3674f4530L, 0xb0cf55261b526a1fL, 0x2c8eb033a834fe3fL, "jetbrains.mps.samples.KajaSceneConstruction.structure.AbstractBuilderCommand"))) {
        if ("jetbrains.mps.samples.KajaSceneConstruction.editor.Position".equals(editorComponentId)) {
          return Collections.<ConceptEditorComponent>singletonList(new Position());
        }
      }
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }


}
