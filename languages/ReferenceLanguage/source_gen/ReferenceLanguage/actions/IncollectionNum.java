package ReferenceLanguage.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import ReferenceLanguage.behavior.Libraries__BehaviorDescriptor;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class IncollectionNum {
  public static class NodeFactory_2432563194114882493 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      SNode nodeLibraries = (SNode) enclosingNode;
      SPropertyOperations.assign(newNode, PROPS.serNumber$lQc, (int) Libraries__BehaviorDescriptor.getNuberOfReferences_id1SVD7HltPDO.invoke(nodeLibraries));
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$lQc = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef22695L, 0x21c2335636e8318fL, "serNumber");
  }
}
