package ReferenceLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import ReferenceLanguage.behavior.Libraries__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class ConferenceNum {
  public static class NodeFactory_1530532506010542963 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      SNode nodeLibraries = (SNode) enclosingNode;
      SPropertyOperations.assign(newNode, PROPS.serNumber$yN$c, (int) Libraries__BehaviorDescriptor.getNuberOfReferences_id1SVD7HltPDO.invoke(nodeLibraries));
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$yN$c = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL, 0x153d8b3481f26384L, "serNumber");
  }
}