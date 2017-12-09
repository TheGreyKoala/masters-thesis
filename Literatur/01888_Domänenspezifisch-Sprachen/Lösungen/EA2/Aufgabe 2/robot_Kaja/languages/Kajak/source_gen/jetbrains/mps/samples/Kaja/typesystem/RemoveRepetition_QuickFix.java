package jetbrains.mps.samples.Kaja.typesystem;

/*Generated by MPS */

import jetbrains.mps.errors.QuickFix_Runtime;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class RemoveRepetition_QuickFix extends QuickFix_Runtime {
  public RemoveRepetition_QuickFix() {
    super(new SNodePointer("r:af5f8eb9-49c0-4279-87d3-3c80b1a56988(jetbrains.mps.samples.Kaja.typesystem)", "1645404595817127967"));
  }
  public String getDescription(SNode node) {
    return "Replace with the repeat command";
  }
  public void execute(SNode node) {
    SNode repeat = SNodeOperations.replaceWithNewChild(node, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, "jetbrains.mps.samples.Kaja.structure.Repeat"));
    SLinkOperations.setTarget(repeat, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, 0x2de971c785ecd14fL, "body"), SConceptOperations.createNewNode(SNodeOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, "jetbrains.mps.samples.Kaja.structure.CommandList"))));
    ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(repeat, MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, 0x2de971c785ecd14fL, "body")), MetaAdapterFactory.getContainmentLink(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785f06a3fL, 0x2de971c785f06a40L, "commands"))).addElement(SNodeOperations.as(node, MetaAdapterFactory.getConcept(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2d523c5e4cc4574aL, "jetbrains.mps.samples.Kaja.structure.AbstractCommand")));
    SPropertyOperations.set(repeat, MetaAdapterFactory.getProperty(0x49a08c51fe543ccL, 0xbd998b46d641d7f5L, 0x2de971c785ecd14cL, 0x2de971c785ecd14eL, "count"), "" + (2));
    SNodeOperations.deleteNode(SNodeOperations.getPrevSibling(repeat));
  }
}
