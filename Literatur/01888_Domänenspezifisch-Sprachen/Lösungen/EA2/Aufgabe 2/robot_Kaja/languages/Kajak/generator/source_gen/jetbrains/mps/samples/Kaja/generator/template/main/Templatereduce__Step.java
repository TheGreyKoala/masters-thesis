package jetbrains.mps.samples.Kaja.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateDeclarationBase;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.SReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;

@Generated
public class Templatereduce__Step extends TemplateDeclarationBase {
  public Templatereduce__Step() {
  }
  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039580716");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, "jetbrains.mps.baseLanguage.structure.BlockStatement"));
    try {
      environment.nodeCopied(context, tnode1, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039580732");
      TemplateContext context1 = context.subContext();
      {
        final SNode tnode2 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
        try {
          environment.nodeCopied(context1, tnode2, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039580733");
          TemplateContext context2 = context1.subContext();
          {
            final SNode tnode3 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement"));
            try {
              environment.nodeCopied(context2, tnode3, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039581728");
              TemplateContext context3 = context2.subContext();
              {
                final SNode tnode4 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
                try {
                  environment.nodeCopied(context3, tnode4, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039581729");
                  TemplateContext context4 = context3.subContext();
                  {
                    final SNode tnode5 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
                    try {
                      environment.nodeCopied(context4, tnode5, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039580735");
                      TemplateContext context5 = context4.subContext();
                      {
                        final SNode tnode6 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                        try {
                          environment.nodeCopied(context5, tnode6, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/4923130412073284960");
                          tnode6.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode6, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039569801")));
                        } finally {
                        }
                        if (tnode6 != null) {
                          tnode5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression"), tnode6);
                        }
                        // TODO validate child 
                      }
                    } finally {
                    }
                    if (tnode5 != null) {
                      tnode4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnode5);
                    }
                    // TODO validate child 
                  }
                  {
                    final SNode tnode7 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
                    try {
                      environment.nodeCopied(context4, tnode7, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039581853");
                      TemplateContext context7 = context4.subContext();
                      {
                        final SNode tnode8 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                        try {
                          environment.nodeCopied(context7, tnode8, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/4923130412073284194");
                          tnode8.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode8, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039570144")));
                        } finally {
                        }
                        if (tnode8 != null) {
                          tnode7.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression"), tnode8);
                        }
                        // TODO validate child 
                      }
                    } finally {
                    }
                    if (tnode7 != null) {
                      tnode4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnode7);
                    }
                    // TODO validate child 
                  }
                } finally {
                }
                if (tnode4 != null) {
                  tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b219L, "ifTrue"), tnode4);
                }
                // TODO validate child 
              }
              {
                final SNode tnode9 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                try {
                  environment.nodeCopied(context3, tnode9, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/4923130412073261814");
                  tnode9.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode9, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039581734")));
                } finally {
                }
                if (tnode9 != null) {
                  tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition"), tnode9);
                }
                // TODO validate child 
              }
              {
                final SNode tnode10 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, "jetbrains.mps.baseLanguage.structure.BlockStatement"));
                try {
                  environment.nodeCopied(context3, tnode10, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039581769");
                  TemplateContext context10 = context3.subContext();
                  {
                    final SNode tnode11 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
                    try {
                      environment.nodeCopied(context10, tnode11, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039581770");
                      TemplateContext context11 = context10.subContext();
                      {
                        final SNode tnode12 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
                        try {
                          environment.nodeCopied(context11, tnode12, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039581765");
                          TemplateContext context12 = context11.subContext();
                          {
                            final SNode tnode13 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                            try {
                              environment.nodeCopied(context12, tnode13, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/4923130412073306428");
                              tnode13.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode13, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039580739")));
                              TemplateContext context13 = context12.subContext();
                              {
                                final SNode tnode14 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, "jetbrains.mps.baseLanguage.structure.StringLiteral"));
                                try {
                                  environment.nodeCopied(context13, tnode14, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039581767");
                                  SNodeAccessUtil.setProperty(tnode14, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Oops, There's a wall in front of me. I can't make a step forward.");
                                } finally {
                                }
                                if (tnode14 != null) {
                                  tnode13.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), tnode14);
                                }
                                // TODO validate child 
                              }
                            } finally {
                            }
                            if (tnode13 != null) {
                              tnode12.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression"), tnode13);
                            }
                            // TODO validate child 
                          }
                        } finally {
                        }
                        if (tnode12 != null) {
                          tnode11.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnode12);
                        }
                        // TODO validate child 
                      }
                    } finally {
                    }
                    if (tnode11 != null) {
                      tnode10.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements"), tnode11);
                    }
                    // TODO validate child 
                  }
                } finally {
                }
                if (tnode10 != null) {
                  tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement"), tnode10);
                }
                // TODO validate child 
              }
            } finally {
            }
            if (tnode3 != null) {
              tnode2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnode3);
            }
            // TODO validate child 
          }
        } finally {
        }
        if (tnode2 != null) {
          tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements"), tnode2);
        }
        // TODO validate child 
      }
    } finally {
    }
    return tnode1;
  }
  @Override
  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context) throws GenerationException {
    return TemplateUtil.singletonList(applyPart0(context));
  }

  @Override
  public Collection<SNode> weave(@NotNull NodeWeaveFacility.WeaveContext weaveContext, @NotNull NodeWeaveFacility weaveSupport) throws GenerationException {
    final TemplateContext templateContext = weaveSupport.getTemplateContext();
    SNode tnodepart0 = applyPart0(templateContext);
    weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnodepart0);
    return TemplateUtil.singletonList(tnodepart0);
  }
}
