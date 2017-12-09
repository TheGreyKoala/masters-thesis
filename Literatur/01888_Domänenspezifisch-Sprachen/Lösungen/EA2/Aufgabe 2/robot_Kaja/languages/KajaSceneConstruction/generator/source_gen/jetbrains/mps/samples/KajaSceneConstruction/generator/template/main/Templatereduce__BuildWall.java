package jetbrains.mps.samples.KajaSceneConstruction.generator.template.main;

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
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.Collection;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;

@Generated
public class Templatereduce__BuildWall extends TemplateDeclarationBase {
  public Templatereduce__BuildWall() {
  }
  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273563034");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, "jetbrains.mps.baseLanguage.structure.BlockStatement"));
    try {
      environment.nodeCopied(context, tnode1, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273563050");
      TemplateContext context1 = context.subContext();
      {
        final SNode tnode2 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
        try {
          environment.nodeCopied(context1, tnode2, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273563051");
          TemplateContext context2 = context1.subContext();
          {
            final SNode tnode3 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, "jetbrains.mps.baseLanguage.structure.IfStatement"));
            try {
              environment.nodeCopied(context2, tnode3, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648313");
              TemplateContext context3 = context2.subContext();
              {
                final SNode tnode4 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
                try {
                  environment.nodeCopied(context3, tnode4, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648314");
                  TemplateContext context4 = context3.subContext();
                  {
                    final SNode tnode5 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
                    try {
                      environment.nodeCopied(context4, tnode5, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/6405700485436210200");
                      TemplateContext context5 = context4.subContext();
                      {
                        final SNode tnode6 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                        try {
                          environment.nodeCopied(context5, tnode6, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/4923130412073299466");
                          tnode6.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode6, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273550801")));
                          TemplateContext context6 = context5.subContext();
                          {
                            final SNode tnode7 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant"));
                            try {
                              environment.nodeCopied(context6, tnode7, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273563052");
                              SNodeAccessUtil.setProperty(tnode7, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273563062(new PropertyMacroContext(context6, "0", propertyMacro_mg165o_c0a0c0b0b0d0b0c0b0c0b0c0b0c0b0c0c0c))));
                            } finally {
                            }
                            if (tnode7 != null) {
                              tnode6.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), tnode7);
                            }
                            // TODO validate child 
                          }
                          {
                            final SNode tnode8 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant"));
                            try {
                              environment.nodeCopied(context6, tnode8, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273563054");
                              SNodeAccessUtil.setProperty(tnode8, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273563071(new PropertyMacroContext(context6, "0", propertyMacro_mg165o_c0a0c0b0b0e0b0c0b0c0b0c0b0c0b0c0c0c))));
                            } finally {
                            }
                            if (tnode8 != null) {
                              tnode6.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), tnode8);
                            }
                            // TODO validate child 
                          }
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
                    final SNode tnode9 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
                    try {
                      environment.nodeCopied(context4, tnode9, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273563056");
                      TemplateContext context9 = context4.subContext();
                      {
                        final SNode tnode10 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                        try {
                          environment.nodeCopied(context9, tnode10, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/4923130412073195360");
                          tnode10.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode10, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273550615")));
                        } finally {
                        }
                        if (tnode10 != null) {
                          tnode9.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression"), tnode10);
                        }
                        // TODO validate child 
                      }
                    } finally {
                    }
                    if (tnode9 != null) {
                      tnode4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnode9);
                    }
                    // TODO validate child 
                  }
                  {
                    final SNode tnode11 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b215L, "jetbrains.mps.baseLanguage.structure.Statement"));
                    try {
                      environment.nodeCopied(context4, tnode11, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648315");
                    } finally {
                    }
                    if (tnode11 != null) {
                      tnode4.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnode11);
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
                final SNode tnode12 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb7c3070eeL, "jetbrains.mps.baseLanguage.structure.AndExpression"));
                try {
                  environment.nodeCopied(context3, tnode12, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648339");
                  TemplateContext context12 = context3.subContext();
                  {
                    final SNode tnode13 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                    try {
                      environment.nodeCopied(context12, tnode13, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/4923130412073221726");
                      tnode13.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode13, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273648281")));
                      TemplateContext context13 = context12.subContext();
                      {
                        final SNode tnode14 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant"));
                        try {
                          environment.nodeCopied(context13, tnode14, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648343");
                          SNodeAccessUtil.setProperty(tnode14, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273648347(new PropertyMacroContext(context13, "0", propertyMacro_mg165o_c0a0c0b0b0d0b0c0b0d0b0c0b0c0c0c))));
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
                      tnode12.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"), tnode13);
                    }
                    // TODO validate child 
                  }
                  {
                    final SNode tnode15 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                    try {
                      environment.nodeCopied(context12, tnode15, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/4923130412073284425");
                      tnode15.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode15, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3210697320273648203")));
                      TemplateContext context15 = context12.subContext();
                      {
                        final SNode tnode16 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant"));
                        try {
                          environment.nodeCopied(context15, tnode16, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648318");
                          SNodeAccessUtil.setProperty(tnode16, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3210697320273648356(new PropertyMacroContext(context15, "0", propertyMacro_mg165o_c0a0c0b0b0d0b0d0b0d0b0c0b0c0c0c))));
                        } finally {
                        }
                        if (tnode16 != null) {
                          tnode15.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), tnode16);
                        }
                        // TODO validate child 
                      }
                    } finally {
                    }
                    if (tnode15 != null) {
                      tnode12.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"), tnode15);
                    }
                    // TODO validate child 
                  }
                } finally {
                }
                if (tnode12 != null) {
                  tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition"), tnode12);
                }
                // TODO validate child 
              }
              {
                final SNode tnode17 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, "jetbrains.mps.baseLanguage.structure.BlockStatement"));
                try {
                  environment.nodeCopied(context3, tnode17, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648364");
                  TemplateContext context17 = context3.subContext();
                  {
                    final SNode tnode18 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
                    try {
                      environment.nodeCopied(context17, tnode18, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648365");
                      TemplateContext context18 = context17.subContext();
                      {
                        final SNode tnode19 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, "jetbrains.mps.baseLanguage.structure.ExpressionStatement"));
                        try {
                          environment.nodeCopied(context18, tnode19, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648366");
                          TemplateContext context19 = context18.subContext();
                          {
                            final SNode tnode20 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x6c6b6a1e379f9404L, "jetbrains.mps.baseLanguage.structure.LocalMethodCall"));
                            try {
                              environment.nodeCopied(context19, tnode20, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/4923130412073215135");
                              tnode20.setReference(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), SReference.create(MetaAdapterFactory.getReferenceLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301adL, "baseMethodDeclaration"), tnode20, PersistenceFacade.getInstance().createModelReference("r:f5e9b11f-5073-4786-8ed1-a9e42307c3f8(JavaKaja.runtime)"), PersistenceFacade.getInstance().createNodeId("3308300503039580739")));
                              TemplateContext context20 = context19.subContext();
                              {
                                final SNode tnode21 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, "jetbrains.mps.baseLanguage.structure.StringLiteral"));
                                try {
                                  environment.nodeCopied(context20, tnode21, "tpl/r:262b93f0-fe86-497c-93c5-efd684d05bc6/3210697320273648368");
                                  SNodeAccessUtil.setProperty(tnode21, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "Attempted to build wall outside of the playground!");
                                } finally {
                                }
                                if (tnode21 != null) {
                                  tnode20.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11857355952L, 0xf8c78301aeL, "actualArgument"), tnode21);
                                }
                                // TODO validate child 
                              }
                            } finally {
                            }
                            if (tnode20 != null) {
                              tnode19.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b213L, 0xf8cc56b214L, "expression"), tnode20);
                            }
                            // TODO validate child 
                          }
                        } finally {
                        }
                        if (tnode19 != null) {
                          tnode18.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnode19);
                        }
                        // TODO validate child 
                      }
                    } finally {
                    }
                    if (tnode18 != null) {
                      tnode17.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfc092b6b77L, 0xfc092b6b78L, "statements"), tnode18);
                    }
                    // TODO validate child 
                  }
                } finally {
                }
                if (tnode17 != null) {
                  tnode3.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xfc092b6b76L, "ifFalseStatement"), tnode17);
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
  private static SNodePointer propertyMacro_mg165o_c0a0c0b0b0d0b0c0b0c0b0c0b0c0b0c0c0c = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273563059");
  private static SNodePointer propertyMacro_mg165o_c0a0c0b0b0e0b0c0b0c0b0c0b0c0b0c0c0c = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273563068");
  private static SNodePointer propertyMacro_mg165o_c0a0c0b0b0d0b0c0b0d0b0c0b0c0c0c = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273648344");
  private static SNodePointer propertyMacro_mg165o_c0a0c0b0b0d0b0d0b0d0b0c0b0c0c0c = new SNodePointer("r:262b93f0-fe86-497c-93c5-efd684d05bc6(jetbrains.mps.samples.KajaSceneConstruction.generator.template.main@generator)", "3210697320273648353");
}
