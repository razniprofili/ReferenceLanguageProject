package ReferenceLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class Conference_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("[");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.serNumber$3owZ) + "] ");
    {
      Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.authors$ludf);
      final SNode lastItem = Sequence.fromIterable(collection).last();
      for (SNode item : collection) {
        tgs.appendNode(item);
        if (item != lastItem) {
          tgs.append(", ");
        }
      }
    }
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.title$luFh));
    tgs.append(", ");
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.pages$lASO) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.pages$lASO) + ". ");
    }
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.publisher$lHef) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.publisher$lHef));
      tgs.append(", ");
    }
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$lNMF) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$lNMF));
      tgs.append(", ");
    }
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$l_HJ) + ".");
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$3owZ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555fd52cL, 0x1159e6fb6e9e4ecbL, "serNumber");
    /*package*/ static final SProperty title$luFh = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL, 0x1da23d5c1241dc02L, "title");
    /*package*/ static final SProperty pages$lASO = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL, 0x1da23d5c1241dc10L, "pages");
    /*package*/ static final SProperty publisher$lHef = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL, 0x1da23d5c1241dc16L, "publisher");
    /*package*/ static final SProperty address$lNMF = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL, 0x1da23d5c1241dc1dL, "address");
    /*package*/ static final SProperty year$l_HJ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL, 0x1da23d5c1241dc0bL, "year");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink authors$ludf = MetaAdapterFactory.getContainmentLink(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1da23d5c1241dbffL, 0x1da23d5c1241dc00L, "authors");
  }
}
