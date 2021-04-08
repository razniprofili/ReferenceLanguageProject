package ReferenceLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class Author_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.firstName$_Jim).charAt(0) + ".");
    tgs.append(" ");
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.middleName$_JZp) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.middleName$_JZp).charAt(0) + ".");
      tgs.append(" ");
    }
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.surname$_Q5N));
  }

  private static final class PROPS {
    /*package*/ static final SProperty firstName$_Jim = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd1eab40L, 0x1a03dc0acd30fd73L, "firstName");
    /*package*/ static final SProperty middleName$_JZp = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd1eab40L, 0x1a03dc0acd30fd76L, "middleName");
    /*package*/ static final SProperty surname$_Q5N = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd1eab40L, 0x1a03dc0acd30fd7bL, "surname");
  }
}
