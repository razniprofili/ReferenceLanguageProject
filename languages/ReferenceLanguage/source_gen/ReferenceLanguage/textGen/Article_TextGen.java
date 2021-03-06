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

public class Article_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("[");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.serNumber$3owZ) + "] ");
    {
      Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.authors$3Dcf);
      final SNode lastItem = Sequence.fromIterable(collection).last();
      for (SNode item : collection) {
        tgs.appendNode(item);
        if (item != lastItem) {
          tgs.append(", ");
        }
      }
    }
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.title$67zM));
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.journal$68gP));
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.volume$6g0m) != null) {
      tgs.append(", ");
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.volume$6g0m));
    }
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.number$6n2O) != null) {
      tgs.append("(");
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.number$6n2O));
      tgs.append(")");
    }
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.pages$6uzk) != null) {
      tgs.append(":");
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.pages$6uzk));
    }
    tgs.append(", ");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$6enf) + ".");
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$3owZ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555fd52cL, 0x1159e6fb6e9e4ecbL, "serNumber");
    /*package*/ static final SProperty title$67zM = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fbfeL, "title");
    /*package*/ static final SProperty journal$68gP = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fc01L, "journal");
    /*package*/ static final SProperty volume$6g0m = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fc0dL, "volume");
    /*package*/ static final SProperty number$6n2O = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fc16L, "number");
    /*package*/ static final SProperty pages$6uzk = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fc21L, "pages");
    /*package*/ static final SProperty year$6enf = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fc06L, "year");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink authors$3Dcf = MetaAdapterFactory.getContainmentLink(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fbfaL, 0x1a03dc0acd30fbfbL, "authors");
  }
}
