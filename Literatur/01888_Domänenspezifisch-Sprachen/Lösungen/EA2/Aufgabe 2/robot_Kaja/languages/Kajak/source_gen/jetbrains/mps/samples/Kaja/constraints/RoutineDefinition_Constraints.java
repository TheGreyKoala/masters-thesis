package jetbrains.mps.samples.Kaja.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.SNodePointer;

public class RoutineDefinition_Constraints extends BaseConstraintsDescriptor {
  public RoutineDefinition_Constraints() {
    super(MetaIdFactory.conceptId(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ed6f79L));
  }
  @Override
  public boolean hasOwnCanBeChildMethod() {
    return true;
  }
  @Override
  public boolean canBeChild(@Nullable SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext, @Nullable final CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAChild(node, parentNode, link, childConcept, operationContext);

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
    }

    return result;
  }
  public static boolean static_canBeAChild(SNode node, SNode parentNode, SNode link, SNode childConcept, final IOperationContext operationContext) {
    return (SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, "jetbrains.mps.samples.Kaja.structure.CommandList")) && SNodeOperations.isInstanceOf(SNodeOperations.getParent(parentNode), MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc45746L, "jetbrains.mps.samples.Kaja.structure.Script"))) || SNodeOperations.isInstanceOf(parentNode, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x3cfcda239f19d316L, "jetbrains.mps.samples.Kaja.structure.Library"));
  }
  private static SNodePointer canBeChildBreakingPoint = new SNodePointer("r:6c66d6ce-c8f4-4daf-92c4-a518b78006a8(jetbrains.mps.samples.Kaja.constraints)", "3308300503039782408");
}
